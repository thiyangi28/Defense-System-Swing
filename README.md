# 🛡️ Defense System Project (Observer Design Pattern)

A robust command-and-control simulation system built with **Java Swing**. This project demonstrates the practical application of the **Observer Design Pattern**, where a central intelligence unit (Main Controller) communicates with and controls multiple defense units in real-time.

---

## ✨ Features

* **Centralized Command**: A `MainController` that can broadcast messages to all units or individual units.
* **Observer Pattern Implementation**: Dynamic registration and notification of defense units (`Helicopter`, `Tank`, `Submarine`).
* **Dynamic Capability Unlocking**: Attack options (Shoot, Missile, Laser, Sonar) are automatically enabled or disabled based on the unit's proximity to the target.
* **Real-time Synchronization**: 
    * Area clearance status updates across all units.
    * Real-time position tracking via sliders.
    * Bi-directional communication (Messaging between Controller and Units).
* **Unit-Specific Stats**: Individual monitoring of Soldier counts, Ammo counts, Fuel levels, and Oxygen levels.

---

## 🏗️ System Architecture

The project is designed using core **Object-Oriented Programming (OOP)** principles:



* **Subject (Subject Interface)**: `DefenceUnitInterface` / `DefenceUnitSystem`
* **Observer (Observer Interface)**: `DefenseUnit`
* **Concrete Observers**: `Helicopter`, `Tank`, `Submarine`
* **Controller**: `MainController`

---

## 🛠️ Technology Stack

* **Language**: Java (JDK 17 or higher)
* **GUI Framework**: Java Swing (NetBeans GUI Builder / Matisse)
* **Build System**: Maven

---

## 🚀 Getting Started

### Prerequisites
* Java Development Kit (JDK) 17+
* An IDE like **NetBeans**, **IntelliJ IDEA**, or **Eclipse**.

### Installation & Run
1.  **Clone the repository**:
    ```bash
    git clone [https://github.com/YOUR_USERNAME/DefenseSystemProject.git](https://github.com/YOUR_USERNAME/DefenseSystemProject.git)
    ```
2.  **Open the project** in your preferred IDE.
3.  **Run the Main Class**: Locate `DefenseSystemProject.java` in the `defensesystemproject` package and run it.

---

## 🎮 How to Use
1.  Launch the application to see the **Main Controller** and the three defense units.
2.  Check the **"Position"** checkbox on any unit to enable distance-based controls.
3.  Use the slider on the Main Controller to change the distance; notice how buttons enable/disable on the units based on their logic (e.g., Tank unlocks Redar at 60+ distance).
4.  Send messages from the Controller to units, and vice versa.
5.  Toggle **"Area Clear"** to update the status label on all active units simultaneously.

---

