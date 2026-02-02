## WHAT HAS BEEN SET UP SO FAR

### 1. Development Environment
- **IDE:** VSCode with Java extensions
- **Build Tool:** Maven 3.9.12
- **JDK:** OpenJDK 24.0.2 (Temurin)
- **GUI Framework:** JavaFX 21.0.1
- **CSV Library:** OpenCSV 5.9
- **Testing:** JUnit 5.10.1

### 2. Project Structure Created
```
eecs3311-reservation/
├── src/
│   ├── main/
│   │   ├── java/ca/yorku/eecs3311/
│   │   │   ├── App.java                    # Main application entry point
│   │   │   ├── controller/                 # JavaFX controllers (FXML handlers)
│   │   │   ├── dao/                        # Data Access Objects (CSV operations)
│   │   │   ├── model/                      # Domain models
│   │   │   │   ├── user/                   # User hierarchy classes
│   │   │   │   ├── equipment/              # Equipment-related classes
│   │   │   │   ├── booking/                # Booking system classes
│   │   │   │   ├── payment/                # Payment processing classes
│   │   │   │   └── enums/                  # Enumerations
│   │   │   └── service/                    # Business logic services
│   │   └── resources/
│   │       ├── data/                       # CSV database files
│   │       ├── views/                      # FXML UI layouts
│   │       └── styles/                     # CSS stylesheets
│   └── test/                               # Unit tests
├── target/                                 # Maven build output (auto-generated)
├── diagrams/                               # D1 UML diagrams
├── docs/                                   # D1 documentation
├── .gitignore                              # Git ignore rules
├── pom.xml                                 # Maven configuration
└── README.md                               # Project README

```

### Deliverable 2 Requirements (Due Date: TBD)
1. Redesign project with **6+ design patterns**
2. Build **Java GUI application** using JavaFX
3. Implement **all 10 requirements** from D1
4. Create **component diagram** showing system architecture
5. Use **CSV files** to simulate database
6. Prepare **demo video** (max 20 mins)
7. Write comprehensive **report** justifying design decisions

### Key Requirements Summary (from D1)
- **Req 1:** User registration with strong password validation
- **Req 2:** Only head coordinator can create manager accounts
- **Req 3:** Different hourly rates per user type (Student $10, Faculty $15, Researcher $20, Guest $30)
- **Req 4:** One-hour deposit required for bookings
- **Req 5:** Sensors track equipment usage and send updates
- **Req 6:** Managers add/enable/disable equipment & mark for maintenance
- **Req 7:** Equipment has unique ID, description, lab location
- **Req 8:** Users provide credentials, can modify/cancel bookings
- **Req 9:** Users can extend reservations if equipment is free
- **Req 10:** Multiple payment methods (credit, debit, institutional, research grants)

---------

### 3. Maven Configuration (pom.xml)
- Package: `ca.yorku.eecs3311`
- Main Class: `ca.yorku.eecs3311.App`
- Dependencies: JavaFX, OpenCSV, JUnit
- Build: Maven Compiler Plugin + JavaFX Maven Plugin

### 4. Git Branch Strategy
- **main** branch: Production-ready code only
- **Feature branches:** `yourname/feature-name` format
  - Example: `egeyesss/user-authentication`
  - Example: `adrenreuel/equipment-management`
  - Example: `kevinsitu1706/booking-system`
  - Example: `gurnoor-kahlon/payment-processing`
  - Example: `maljaufy/admin-dashboard`

**Workflow:**
1. Create feature branch: `git checkout -b yourname/feature-name`
2. Make changes and commit frequently
3. Push to GitHub: `git push -u origin yourname/feature-name`
4. Create Pull Request (PR) when ready
5. Get 1-2 team member reviews
6. Merge to main after approval

---

## WHAT STILL NEEDS TO BE IMPLEMENTED

### Core Models
**Status:** Partially done - structure exists but the classes need to be created

#### User Model Hierarchy (not yet created)
**Location:** `src/main/java/ca/yorku/eecs3311/model/user/`

**Files to create: (fill in)** 
- `User.java` - Abstract base class
  - Properties: userId, email, password, userType, accountStatus, firstName, lastName, department
  - Abstract method: `getHourlyRate()` (polymorphism for Req 3)
  - Static method: `isPasswordStrong()` for validation (Req 1)
  
- `Student.java` extends User
  - Additional: studentId, program
  - Hourly rate: $10
  
- `Faculty.java` extends User
  - Additional: facultyId, position
  - Hourly rate: $15
  
- `Researcher.java` extends User
  - Additional: researcherId, researchArea, certificationNumber
  - Hourly rate: $20
  
- `Guest.java` extends User
  - Additional: organization
  - Hourly rate: $30
  - Auto-approved (no department approval needed)
  
- `Manager.java` extends User
  - Can add/enable/disable equipment (Req 6)
  - Can mark equipment for maintenance (Req 6)
  - Can monitor equipment status (Req 5)
  
- `SystemAdministrator.java` extends Manager
  - Can create manager accounts (Req 2)
  - Can register and approve user accounts (Req 1)
  - Has all Manager privileges

#### 1.2 Enumerations (not created yet)
**Location:** `src/main/java/ca/yorku/eecs3311/model/enums/`

**Files to create:**
- `UserType.java` - STUDENT, FACULTY, RESEARCHER, GUEST, MANAGER, SYSTEM_ADMIN
- `AccountStatus.java` - PENDING, ACTIVE, SUSPENDED, INACTIVE
- `EquipmentStatus.java` - AVAILABLE, RESERVED, IN_USE, MAINTENANCE, DISABLED
- `BookingStatus.java` - PENDING, CONFIRMED, ACTIVE, COMPLETED, CANCELLED, NO_SHOW
- `PaymentMethod.java` - CREDIT_CARD, DEBIT_CARD, INSTITUTIONAL_ACCOUNT, RESEARCH_GRANT

#### 1.3 Equipment Model (not created)
**Location:** `src/main/java/ca/yorku/eecs3311/model/equipment/`

**Files to create:**
- `Equipment.java`
  - Properties: equipmentId, name, description, labLocation, status, hourlyRate
  - Methods: enable(), disable(), markForMaintenance() (Req 6)
  
- `Lab.java`
  - Properties: labId, location, capacity
  - Relationship: Contains multiple Equipment items (Req 7)
  
- `Sensor.java`
  - Monitors equipment usage (Req 5)
  - Sends updates to system
  
- `SensorData.java`
  - Properties: sensorId, timestamp, operationStatus, usageDetails
  - Stores real-time equipment data (Req 5)

#### 1.4 Booking Model (not created yet)
**Location:** `src/main/java/ca/yorku/eecs3311/model/booking/`

**Files to create:**
- `Booking.java`
  - Properties: bookingId, userId, equipmentId, startTime, endTime, status, depositPaid, totalCost
  - Methods: modify(), cancel(), extend() (Req 8, 9)
  
- `BookingManager.java`
  - Handles booking creation, modification, cancellation
  - Checks equipment availability
  - Calculates costs based on user type

#### 1.5 Payment Model (not created yet)
**Location:** `src/main/java/ca/yorku/eecs3311/model/payment/`

**Files to create:**
- `Payment.java`
  - Properties: paymentId, bookingId, amount, method, status, timestamp
  
- `PaymentService.java`
  - Processes different payment methods (Req 10)
  - Handles deposit and refunds (Req 4)
  
- `InstitutionalAccount.java`
  - For university-affiliated user payments

---

### Phase 2: Data Access Layer
**Status:** NOT STARTED  
**Location:** `src/main/java/ca/yorku/eecs3311/dao/`

#### CSV Database Files to Create
**Location:** `src/main/resources/data/`

1. `users.csv` - Store all user accounts
2. `equipment.csv` - Store equipment inventory
3. `bookings.csv` - Store all reservations
4. `payments.csv` - Store payment transactions
5. `sensors.csv` - Store sensor data logs

#### DAO Classes to Create
- `UserDAO.java` - CRUD operations for users
- `EquipmentDAO.java` - CRUD operations for equipment
- `BookingDAO.java` - CRUD operations for bookings
- `PaymentDAO.java` - CRUD operations for payments

**Pattern to use:** DAO Pattern (counts toward 6 design patterns requirement)

---

### Phase 3: Business Logic Services
**Status:** NOT STARTED  
**Location:** `src/main/java/ca/yorku/eecs3311/service/`

#### Services to Create
- `AuthenticationService.java`
  - Login/logout functionality
  - Password validation (Req 1)
  - Session management
  - **Pattern:** Singleton
  
- `NotificationService.java`
  - Send confirmation emails
  - Send alerts for maintenance
  - **Pattern:** Observer
  
- `UserFactory.java`
  - Creates appropriate user type (Student/Faculty/etc.)
  - **Pattern:** Factory Method
  
- `PaymentStrategy.java` + implementations
  - Different payment method handlers
  - **Pattern:** Strategy (Req 10)

---

### Phase 4: User Interface
**Status:** NOT STARTED

#### FXML Layouts to Create
**Location:** `src/main/resources/views/`

1. `login.fxml` - Login screen
2. `user_dashboard.fxml` - Regular user interface
3. `manager_dashboard.fxml` - Lab manager interface
4. `admin_dashboard.fxml` - System admin interface
5. `booking_dialog.fxml` - Equipment reservation dialog
6. `equipment_list.fxml` - Browse available equipment
7. `payment_dialog.fxml` - Payment processing

#### Controllers to Create
**Location:** `src/main/java/ca/yorku/eecs3311/controller/`

1. `LoginController.java` - Handles login logic
2. `UserDashboardController.java` - User actions
3. `ManagerDashboardController.java` - Manager actions
4. `AdminDashboardController.java` - Admin actions
5. `BookingController.java` - Booking operations
6. `PaymentController.java` - Payment processing

#### CSS Styling
**Location:** `src/main/resources/styles/`
- `app.css` - Main application stylesheet

**Pattern to use:** MVC (Model-View-Controller) - built into JavaFX architecture

---

### Phase 5: Design Patterns Implementation
**Status:** NOT STARTED

We need **6 design patterns minimum**. Here's the plan:

1. **Singleton Pattern** ✓
   - `AuthenticationService` - Only one instance needed
   - `BookingManager` - Centralized booking management
   
2. **Factory Pattern** ✓
   - `UserFactory` - Create different user types (Student/Faculty/etc.)
   
3. **Observer Pattern** ✓
   - `Sensor` → `Equipment` - Real-time status updates (Req 5)
   - `NotificationService` for event notifications
   
4. **Strategy Pattern** ✓
   - `PaymentStrategy` - Different payment methods (Req 10)
   - Implementations: CreditCardPayment, DebitCardPayment, InstitutionalPayment, ResearchGrantPayment
   
5. **State Pattern** ✓
   - `BookingState` - Booking status transitions (pending → confirmed → active → completed)
   - Ensures valid state transitions
   
6. **Facade Pattern** ✓
   - `BookingFacade` - Simplifies complex booking process
   - Coordinates User, Equipment, Payment, Notification services

**Additional patterns to consider:**
- **DAO Pattern** - Already planned for data access
- **Template Method** - For common booking workflows
- **Decorator** - For equipment features/add-ons
