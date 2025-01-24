Flitness

Design a backend system for a new enterprise application that Flipkart is launching, Flitness. Initially, Flipkart is partnering up with gyms across Bangalore to enter into the fitness space. For the Beta launch the requirements are as follows:

There are only 2 centers for now - Koramangala and Bellandur. We plan to expand to multiple others if we get traction. Each center has n slots of an hour each. For eg the Bellandur center has only 6 slots - 3 in the morning of an hour each from 6am to 9am and similarly 3 in the evening from 6pm to 9pm. All the centers are open 7 days a week. Each slot at a center can have k possible workout variations - Weights, Cardio, Yoga, Swimming etc. There could be newer workouts added at center/slot level in the future. Adding new workout types should be easy and lead to minimal or no changes in application. The number of seats in each workout at each time-slot for a given center is fixed. For simplicity's sake you can assume that the workout info will be entered by the Admin only once.

User should be able perform the following operations: Register onto the platform with [name, email & user-location(string)]

registerUser(name, email, location)
View the workouts availability/unavailability for a particular day

viewWorkoutS/otAvailability("Weights", "20-09-24")
Book a workout for a user, if seats are available in that time

bookSession(email, workoutLocation, workoutType, startTime, end Time, “20-09-24"）
Note: partial booking is not allowed.
View schedule for a day basis workout type/center as input. It should be easy to change the view pattern. If no workout type or center is provided, return the full day's schedule.

view Schedule(email, "20-09-24")
Users should not be able to book more than W number of workout sessions in a week across all workoutTypes.

Admin should be able to perform following operation: addWorkout("Koramangala", "Weights", startTime:int, endTime:int, capacity:int, "01-09-24", "30-09-24")

Note: No need to register admin as a user, you can assume that admin is created by default. No functional requirements apart from addWorkout is required for Admin

Bonus Sort the viewWorkoutAvailability w.r.t user’s location (closest first). Assume the distance matrix between different locations to (Bellandur, Koramangala) for now to be static.

Guidelines: Time: 90 mins Write modular & clean code A driver program / main class / test case is needed to test out the code by evaluator with multiple test cases. But do not spend too much time parsing input. Keep it as simple as possible Evaluation Criteria: Demoable & functionally correct code, code readability, proper entity modeling, modular, extensible, separation of concerns, Abstractions. Use design patterns wherever applicable. No external DBs like MySQL, use in memory database only. No need to create UX. Please focus on bonus features only after ensuring the required features are complete & demoable.