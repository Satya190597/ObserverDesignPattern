# ObserverDesignPattern
Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they're observing.

# Problem Statement
In this repository, we are taking an example of a famous YouTuber, Mr. Beast. Mr. Beast wants that whenever he uploads a video, his subscribers from different platforms should get a notification. He also further wants customization features so that he can decide who should get a notification for a particular video.

# Important Classes
### Publisher
- MrBeastYoutube.java
### Subscriber
- FamilyAndFriends.java
- PatreonMembers.java
- WebsiteMembers.java
- YoutubeMembers.java
### Client
- MrBeastStudio.java 
# Test Classes
- MrBeastStudioTest.java - This class contains test cases for the MrBeastStudio class, to test its update functionality.


# Prerequisite
- Java 8 or above.
  
# Dependencies
- junit
- junit-jupiter-api
