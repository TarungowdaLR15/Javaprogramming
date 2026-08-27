# 🚦 Traffic Violation Analyser

A simple and interactive **Traffic Violation Analyser** that validates Indian vehicle registration numbers and identifies common traffic violations based on vehicle type, speed, driver age, helmet/seat-belt usage, and emergency-vehicle status.

The project is designed to demonstrate how programming and web technologies can be used to build a basic **Smart Transportation and Road Safety** solution.

---


---

## 📌 Why I Made This Project

Road safety is an important real-world problem. Traffic violations such as speeding, riding without a helmet, driving without a seat belt, and underage driving can increase the risk of accidents.

I created this project to build a simple system that can:

* Validate Indian vehicle registration numbers.
* Identify the type of vehicle.
* Check vehicle speed.
* Check driver age.
* Check helmet usage for 2-wheelers.
* Check seat-belt usage for 4-wheelers.
* Identify emergency vehicles.
* Detect applicable traffic violations.
* Automatically calculate the total fine.

The main goal is to convert basic programming concepts into a **real-world road-safety application**.

---

## 🎯 Problem Statement

Manual identification of traffic violations can require significant human effort.

This project provides a basic automated approach where the user enters vehicle and driver information, and the system analyses the provided information to identify possible violations and calculate the applicable fine.

> **Note:** This is an educational prototype and not an official traffic enforcement system.

---

## 💡 Solution

The Traffic Violation Analyser takes several inputs:

```text
Vehicle Number
      ↓
Vehicle Type
      ↓
Vehicle Speed
      ↓
Driver Age
      ↓
Helmet / Seat Belt Status
      ↓
Emergency Vehicle Status
      ↓
Violation Analysis
      ↓
Fine Calculation
      ↓
Final Result
```

---

## 🚘 Features

### 1. Indian Vehicle Number Validation

The system validates vehicle numbers using the standard pattern used by many Indian registrations.

Example:

```text
KA01AB1234
```

The validation checks for:

```text
2 letters + 2 digits + 1–3 letters + 4 digits
```

### Valid Examples

```text
KA01AB1234
MH12XY5678
DL01C1234
TN09AB1234
```

### Invalid Examples

```text
K01AB1234
KA0AAB1234
KA01AB123
KA01AB12345
```

---

## 🛵 Vehicle-Based Validation

The project handles three vehicle categories:

| Vehicle   | Helmet Check | Seat Belt Check |
| --------- | ------------ | --------------- |
| 2 Wheeler | ✅ Yes        | ❌ No            |
| 3 Wheeler | ❌ No         | ❌ No            |
| 4 Wheeler | ❌ No         | ✅ Yes           |

This ensures that helmet and seat-belt checks are applied according to the selected vehicle type.

---

## ⚠️ Traffic Violations

The current prototype checks the following conditions.

### Underage Driver

If:

```text
Driver Age < 18
```

Fine:

```text
₹2000
```

---

### Speeding

If:

```text
Speed > 60 km/h
```

Fine:

```text
₹1000
```

Emergency vehicles are excluded from this speeding rule in this educational prototype.

---

### No Helmet

Applicable only to:

```text
2 Wheelers
```

Fine:

```text
₹500
```

---

### No Seat Belt

Applicable only to:

```text
4 Wheelers
```

Fine:

```text
₹500
```

---

## 🧮 Example

Suppose the user enters:

```text
Vehicle Number: KA01AB1234
Vehicle Type: 2 Wheeler
Speed: 75 km/h
Driver Age: 20
Helmet: No
Emergency Vehicle: No
```

The system detects:

```text
Speeding       → ₹1000
No Helmet      → ₹500
```

Therefore:

```text
Total Fine = ₹1500
```

---

## 🖥️ Technologies Used

### Frontend

* HTML5
* CSS3
* JavaScript

### Programming Language

* Java

### Tools

* VS Code / IntelliJ IDEA / Eclipse
* Git
* GitHub
* Web Browser

---

## 🏗️ Project Structure

```text
TrafficViolationAnalyser/
│
├── index.html
│
├── javaproject.java
│
└── README.md
```

---

## 🔄 Working Flow

```text
START
  │
  ▼
Enter Vehicle Number
  │
  ▼
Validate Indian Vehicle Number
  │
  ├── Invalid → Display Error
  │
  ▼
Select Vehicle Type
  │
  ▼
Enter Speed
  │
  ▼
Enter Driver Age
  │
  ▼
Helmet Check
(Only 2 Wheeler)
  │
  ▼
Seat Belt Check
(Only 4 Wheeler)
  │
  ▼
Emergency Vehicle Check
  │
  ▼
Analyse Violations
  │
  ▼
Calculate Total Fine
  │
  ▼
Display Final Result
  │
  ▼
END
```

---

# 🌍 Domain

## Smart Transportation & Intelligent Transportation Systems (ITS)

This project comes under the broader domain of:

**Smart Transportation / Intelligent Transportation Systems / Road Safety Technology**

It demonstrates how software can assist with traffic-rule analysis and automated violation processing.

### Related domains

* 🚦 Smart Transportation
* 🛣️ Road Safety
* 🚘 Traffic Management
* 💻 Web Development
* ☕ Java Programming
* 🤖 Automation
* 🌐 Intelligent Transportation Systems

---

# 🎓 Academic Concepts Demonstrated

This project demonstrates several programming concepts:

### Java

* `Scanner`
* Variables
* Data types
* `if-else`
* Boolean conditions
* String handling
* Regular expressions
* Arithmetic operations
* Input validation
* Conditional fine calculation

### Web Development

* HTML forms
* CSS styling
* JavaScript DOM manipulation
* Event handling
* Form validation
* Dynamic result generation

---

# 🔐 Validation Logic

The vehicle number is validated using:

```regex
^[A-Z]{2}[0-9]{2}[A-Z]{1,3}[0-9]{4}$
```

The application automatically converts lowercase input to uppercase.

For example:

```text
ka01ab1234
```

becomes:

```text
KA01AB1234
```

---

# 🚀 Deployment

The HTML version can be deployed using platforms such as:

* GitHub Pages
* Netlify
* Vercel

Since the current frontend does not require a server or database, it can be deployed as a static website.

### GitHub Pages

1. Create a GitHub repository.
2. Upload `index.html`.
3. Upload `README.md`.
4. Go to:

```text
Settings → Pages
```

5. Select the main branch.
6. Save.
7. GitHub will generate a public website URL.

---

# ⚠️ Important Disclaimer

This project is created for **educational and demonstration purposes**.

The fine amounts and traffic rules implemented in this prototype are simplified examples and should **not be treated as official current Indian traffic penalties**.

Actual traffic rules, penalties, exemptions, and registration formats may vary by law, state, vehicle category, and current government regulations.

---

# 🔮 Future Improvements

This project can be expanded into a much more advanced Smart Transportation application.

### Phase 1

* [ ] Better Indian registration-number validation
* [ ] Improved UI/UX
* [ ] Traffic violation history
* [ ] Downloadable violation report
* [ ] Responsive mobile design

### Phase 2

* [ ] Database integration
* [ ] User login
* [ ] Admin dashboard
* [ ] Store previous violations
* [ ] Search vehicle history

### Phase 3

* [ ] Camera-based vehicle detection
* [ ] Automatic number-plate recognition (ANPR)
* [ ] Speed-camera integration
* [ ] Helmet detection using computer vision
* [ ] Seat-belt detection using computer vision

### Phase 4 — AI/ML

The project can eventually become an AI-based traffic monitoring system using:

```text
Camera
   ↓
Vehicle Detection
   ↓
Number Plate Recognition
   ↓
Vehicle Classification
   ↓
Helmet/Seat Belt Detection
   ↓
Speed Analysis
   ↓
Violation Detection
   ↓
Automated Report
```

Possible technologies:

* Python
* OpenCV
* YOLO
* OCR
* Machine Learning
* Deep Learning
* Computer Vision

---

# 📈 Future AI Version

The current project is rule-based.

A future version could use:

**Computer Vision + OCR + Machine Learning + Web Technology**

For example:

```text
Traffic Camera
      ↓
Detect Vehicle
      ↓
Read Number Plate
      ↓
Identify Vehicle Type
      ↓
Detect Helmet / Seat Belt
      ↓
Estimate Speed
      ↓
Identify Violation
      ↓
Generate Digital Report
```

This would transform the project from a basic rule-based application into an **AI-powered Smart Traffic Monitoring System**.

---

# 👨‍💻 Author

**Tarun Gowda LR**

B.Tech — Computer Science & Engineering (AI & ML)

---

# ⭐ Project Goal

> **"Using technology to make traffic monitoring smarter, faster and more efficient."**

This project is a starting point toward building intelligent systems that can contribute to **road safety, automated traffic management, and smart-city infrastructure**.

---

## 📜 License

This project is created for educational purposes.

You are free to modify and improve the project for learning and academic use.
