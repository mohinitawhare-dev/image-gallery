📸 Image Gallery 

A full-stack Image Gallery web application that allows users to upload, view, and delete images.
Built using Spring Boot (Backend) and React.js (Frontend).

🚀 Features

✔ Upload image
✔ View all uploaded images
✔ View single image
✔ Delete image
✔ REST API based backend
✔ Simple and responsive UI

🛠️ Tech Stack
Frontend

React.js

JavaScript

CSS

Axios (API calls)

Backend

Spring Boot

Spring Web

Spring Data JPA

REST API

Multipart File Upload

Database

MySQL 

📂 Project Structure

image-gallery/
│
├── image-gallery-backend/
│
│   ├── pom.xml
│   ├── mvnw
│   ├── mvnw.cmd
│   │
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/
│           │       └── imagegallery/
│           │           ├── ImageGalleryApplication.java
│           │           │
│           │           ├── controller/
│           │           │     └── ImageController.java
│           │           │
│           │           ├── service/
│           │           │     ├── ImageService.java
│           │           │     └── ImageServiceImpl.java
│           │           │
│           │           ├── repository/
│           │           │     └── ImageRepository.java
│           │           │
│           │           └── model/
│           │                 └── Image.java
│           │
│           └── resources/
│               ├── application.properties
│               └── static/
│
│
├── image-gallery-frontend/
│
│   ├── package.json
│   ├── public/
│   │    └── index.html
│   │
│   └── src/
│       ├── components/
│       │     ├── AddImage.js
│       │     ├── DeleteImageList.js
│       │     ├── ImageList.js
│       │     ├── Navbar.js
│       │     ├── SideBar.js
│       │     ├── Home.js
│       │     └── AddImage.css
│       │
│       ├── App.js
│       ├── index.js
│       └── App.css
│
│
├── README.md
└── .gitignore



▶️ How to Run the Project

▶️ How to Run the Project
✅ Prerequisites

Java 17+

Maven

MySQL Database

Node.js & npm

Eclipse IDE

Postman (for API testing)

🔹 1️⃣ Run Backend (Spring Boot using Eclipse)
Step 1:

Open the project in Eclipse

Step 2:

Go to:

src/main/java → YourApplication.java

Right click →
Run As → Spring Boot App

Step 3:

Application will start successfully on:

http://localhost:8080
🔹 2️⃣ Test APIs using Postman

Use the following APIs:

Add Image → POST http://localhost:8080/api/add

Get All Images → GET http://localhost:8080/api/getAll

Get Image By ID → GET http://localhost:8080/api/getOne/{id}

Delete Image → DELETE http://localhost:8080/api/delete/{id}

After adding data →
You can check MySQL database table to verify data is stored.

🔹 3️⃣ Run Frontend (React)
Step 1:

Open frontend folder in VS Code

Step 2:

Run:

npm install
Step 3:

Start the application:

npm start

Frontend will start at:

http://localhost:3000
🔄 Project Flow

1️⃣ Backend runs on Eclipse
2️⃣ APIs tested using Postman
3️⃣ Data stored in MySQL
4️⃣ React frontend fetches data from backend
5️⃣ Images are displayed in browser


👩‍💻 Author

Mohini Tawhare
BSc Computer Science Graduate
Aspiring Java Full Stack Developer

⭐ Future Improvements

Add image update/edit feature

Improve UI design

Make website fully mobile responsive

Add search and filter option

Store images in cloud storage

Deploy project online

✨ Thank you for reviewing this project. I’m open to feedback and continuously working to improve my development skills.


Pagination

Cloud storage integration
