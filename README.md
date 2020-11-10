# RTM Calendar

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
In our app,'Calendar', users can create calendar events and daily tasks on the go.  User's can preview, depending on the view ,which consists of the day, week, or month's prospective, if a day contains an event and click on it to learn more information. Users can also devise a list of daily tasks on a todo list. Items from this list can be added, deleted and modified to the user's wishes and completed tasks can be marked as complete. 

### App Evaluation
- **Category:** Productivity
- **Mobile:** This app would be primarily used on mobile devices so the user can create events and tasks on the go. In future developments, the app could be used on other devices(i.e. laptops, desktops) that would provide a greater view of the app. It could potentially include the most, if all, of the features of mobile devices.
- **Story:** Allows user to monitor events by day, week, or month. The events are displayed to the user, and the user can add tasks to a to do list.
- **Market:** This app is open for any individual to use.
- **Habit:** This app can be used daily to keep track of events and tasks.
- **Scope:** We would start with users creating events and tasks, and then eventually we could integrate API's to add location features that correspond with an event. Eventually events can be shared with others by email. This app has the potential to be interactive, productive, and multi-functional.

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

- [x] Create Parse Server
- [] Compose an event on the timeline
* View event by
     - [ ] Day
     - [ ] Week
     - [x] Month
- [ ] Edit events
- [ ] Compose a task on the to-do list
- [ ] Bottom navigation view
- [ ] User can mark tasks completed on the to-do list

**Optional Nice-to-have Stories**

* Use Google API to show location of events
* Share events by email

### 2. Screen Archetypes
* Calendar Screen
  * The user is given three options (monthly, weekly, and daily view) to choose from in which they want to view the calendar and events they have scheduled.
  * Clicking on a specific day that is marked with event can pull up events scheduled for that day in full detail. 
* Compose Screen
   * Details about the events are filled out in detail. Details include Title, Description, and Time of Event(optional).
   * [Optional] User can add the location of the event using Google Maps.
   * [Optional] User can choose to add an email address to share that particular event with others.
* ToDo List Screen
   * Allows user to add, delete, and modify items in their daily todo list. 
* Text Input Field
   * User inputs text to be added into the Todo list. If a user wishes to modify an preexisting item in the list, they can edit their text as well. 

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Calendar
* Compose Event
* To-Do List

**Flow Navigation** (Screen to Screen)

* Calendar
   * Monthly View -> Compose **Jumps to Compose Screen**
   * Weekly View -> Compose **Jumps to Compose Screen**
   * Daily View -> Compose **Jumps to Compose Screen**
* Compose
   * Overview of Event to Confirm -> Calendar Screen - Daily View   
* Todo List
   * List -> Text Input Field -> List

## Wireframes
<img src="https://i.ibb.co/yR59hhT/wireframes.jpg" width=600>

### [BONUS] Digital Wireframes & Mockups

<img src="https://lucid.app/publicSegments/view/d4a280e2-97bf-40e9-a716-ea018e323e9e/image.jpeg" width=600>

## Schema 
### Models

<!-- TABLE_GENERATE_START -->


| Property | Type | Description|
| ------------- | ------------- | ------------|
| savebutton    | pointerforevent| for keeping track of event|
| |  | |
| eventid       | string        |name of event|
| | | |
| description   | string        |description of event|
|  |  | |
| dateid        | DateTime      |date of event|
|  |  | |
| datepointer   | pointerfordate |to help keep track of date|
|  |  | |
| locationid    | string        |location of event|
|  |  | |
| tasktitle     | string        |title of task|
|  |  | |
| taskdate      | string        |date of task|



<!-- TABLE_GENERATE_END -->
### Networking
- Compose Screen
  - (Create/POST) For new Calendar Event object
  - (Update/PUT) Update already composed Calendar Events
- Calendar Screen
  - (Read/GET) Get all posts created by User and sort them on Calendar
  - (Update/PUT) Update the Calendar Screen with new events
  - (Delete) Delete Events
  - (Update/PUT) Update the Calendar after Deleted Events
  
## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='https://i.imgur.com/8GvSmLn.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />
