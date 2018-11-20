# Piper
* Name: Abigail Tan, Majid Aziz & Alfonso Casatnos
* SID: 2276413, 2283708 & 2283681
* Class: CPSC 356-01 (Professor Fluger)
* Team Name: Pied Piper

## Slogan: For Memers. By Memers.

## Program Description 
* Piper is an all-inclusive, social networking, and blog app that will be very similar to Tumblr. Our app allows users
to upload photos and written works to their profile which anyone can view.

* The main page will be a feed which consists of photos and texts from the people that the user follows. On first activation,
the app will ask the user to create an account or login. Both of these buttons call seperate activites. While logging in, 
the app will bind to a password checking service to make sure the entered password is consistent with the initial account 
creation password. Using the smae logic, the app will bind to a username checking service while creating an account to make 
sure that the username the user wants to have isn't already taken by an already existing user. When a user creates an account,
the data assocaited with that activity will persist using a Room database.

* The main feed will be sorted by the most recent posts by the user's following. Users will be able to like, comment, and 
repost each post on their feed as well as navigate to the profile of the user who created the post. Also, as we are planning on
making a social media networking app, network implementation is a necessity. The apps search function will loop through the 
specified database section.
