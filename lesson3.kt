
    // mpesa system
    fun main() {
    // Step 1: Store the amount to withdraw in a variable
    print("Enter the amount you want to withdraw: ")
    val amount = readLine()!!.toDouble() // Read the input from the user and convert it to Double

    // Step 2: Initialize a variable to store the charges
    var charges = 0.0

    // Step 3: Determine the M-Pesa charges using if-else statements
    if (amount <= 200) {
        charges = 0.0
    } else if (amount > 200 && amount <= 2500) {
        charges = 34.0
    } else if (amount > 2501 && amount <= 5000) {
        charges = 67.0
    } else if (amount > 5001 && amount <= 10000) { 
        charges = 112.0
    } else if (amount > 5001 && amount <= 10000) { 
        charges = 197.0
    } else {
        charges = 250.0
    }

    // Step 4: Display the total charges
    println("Withdrawal amount: KSh $amount")
    println("M-Pesa charges: KSh $charges")
    println("Total amount to be deducted: KSh ${amount + charges}")
}

    
