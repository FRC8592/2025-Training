class GravityCalculator_TAS {
    public static void main(String[] args) {
        // Given values
        double gravity = -9.81;   // m/s^2 (acceleration due to gravity)
        double initialVelocity = 0.0;  // m/s
        double initialPosition = 0.0;  // meters
        double time = 10.0;       // seconds

        // Formula: x(t) = 0.5 * a * t^2 + vi * t + xi
        double finalPosition = 0.5 * gravity * time * time 
                             + initialVelocity * time 
                             + initialPosition;

        // Print result
        System.out.println("Position after " + time + " seconds: " + finalPosition + " m");
    }
}
