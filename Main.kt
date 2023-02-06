import java.util.Calendar;

fun main() {
    println("Hello My Name is Mohamed Rami. What about you? What's your name?");
    print("My name is: ");
    val name = readLine()!!.toString();

    val jawab = askUser("Do you want to calculate your age or my age? (Enter 1 for your age, 2 for my age): ");
    if (jawab.equals("1")) {
        calculateAge(name, "your");
    } else if (jawab.equals("2")) {
        calculateMyAge(name);
    } else {
        println("Invalid input. Please answer either 1 or 2.");
        main();
    }
}

private fun calculateAge(name: String, ageType: String) {
    val birthYear = askUser("Okay, $name. Please enter your birth year: ").toInt();
    val currentYear = Calendar.getInstance().get(Calendar.YEAR);
    val age = currentYear - birthYear;
    println("Your age is $age");
}

private fun calculateMyAge(name: String) {
    val response = askUser("Nice to meet you $name. Can you help me calculate my age? (yes/no): ");
    if (response.equals("yes", ignoreCase = true)) {
        val answer = askUser("My birth year is 2003. Can you find my age? (yes/no): ");
        if (answer.equals("yes", ignoreCase = true)) {
            val age = askUser("So, how old am I? Enter my age: ").toInt();
            val currentYear = Calendar.getInstance().get(Calendar.YEAR);
            val correctAge = currentYear - 2003;
            if (age == correctAge) {
                println("That's correct. Thank you, $name.");
            } else {
                println("Incorrect answer. Please try again.");
                main();
            }
        } else {
            println("Okay. Thank you for your time, $name.");
        }
    } else {
        println("Okay. Thank you for your time, $name.");
    }
}

private fun askUser(prompt: String): String {
    print(prompt);
    val answer = readLine()!!.toString();
    if (answer.isEmpty()) {
        println("Please enter a valid answer.");
        return askUser(prompt);
    }
    return answer;
}
