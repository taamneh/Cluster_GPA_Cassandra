Cluster_GPA_Cassandra
=====================
This program shows how event sourcing is applied when using Akka cluster and Cassandra Cluster

This program was designed to run on multiple JVM either on the same node or on different nodes

All the persistent messages will be saved in Cassandra under "Akka" keyspace, and in messages table

Prerequisites

  - Set up cassandra on multiple machines
  - Run Cassandra cluster on each machine:  ".\cassandra" from inside the cassandra bin folder   
  - In reference.conf file from akka application: change the contact point for both{cassandra-journal, and cassandra-snapshoot} to the machine where you have cassandra up and running: contact-points = ["127.0.0.1", ...]

To run it on differnt machines:
  - Copy the code on each machine
  - In each machine, change the hostname in application.conf to the IP address of that machine.
  - Change the seed node to one of the machine where you plan to run you program in
  - navigate to project folder, and type "sbt"
  - You need to have one GPA cacultor node "consumer", and one or more of Grade generator nodes "Producer"
  - To assinge consumer role for the machine type "run-main StartingPoint consumer 2553"
  - To assinge producer role for the machine type "run-main StartingPoint producer 2553"
  - The node with prodcuer role will ask us to enter a grade, and once enterd the node with consumer role will take it and will caculate the GPA
  - In producer node, Type "Request" to get the GPA, and Throw to fail the GPA actor "consumer"
  
To run in on the same machine

  - the hostname in application.conf should be "127.0.0.1" or localhost
  - Change the seed node to the ports where you plan to run the program
  - navigate to project folder, and type "sbt"
  - You need to have one GPA cacultor node "consumer", and one or more of Grade generator nodes "Producer"
  - To assinge consumer role for the machine type "run-main StartingPoint consumer 2553"
  - To assinge producer role for the machine type "run-main StartingPoint producer 2554"
  - Make sure to have differen port for each node
  
To start the GPA caculator from the beginning: truncate table messages in cassandra
