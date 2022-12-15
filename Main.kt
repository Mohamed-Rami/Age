import java.util.Calendar
fun main() {
    println("Hello My Name is Mohamed Rami What about You What's Your Name ?")
    print("My Name is : ")
    val name = readLine()!!.toString()
    print("Do u Want To Calculate Your Age Or My Age ? (Answer 1 = Your Age | Answer 2 = My Age) ( Enter 1 Or 2) : ")
    val jawab = readLine()!!.toString()
    if (jawab.isNotEmpty()){
        if (jawab == "1"){
            print("Ok Then Soo $name Please enter Your Birth Year : ")
            val Birth_year:Int = readLine()!!.toInt()
            val year = Calendar.getInstance().get(Calendar.YEAR)
            val birth = year - Birth_year
            println("Your Age is $birth")
        }
        if (jawab == "2"){
            if (name.isNotEmpty()){
                print("Nice to meet you $name Iam Happy With You Can Help Me To calculate My Age ? (Yes Or No) : ")
                val reponse = readLine()!!.toString()
                if (reponse == "Yes" || reponse == "yes"){
                    print("My Birth Year Is 2003 Can U Find My Age ? (Yes Or No) : ")
                    val answer = readLine()!!.toString()
                    if (answer == "Yes" || answer == "yes" ){
                        // Check My Age
                        print("Soo How Old Iam ? Enter My Age Please : ")
                        val age = readLine()!!.toInt()
                        // This is My Real Age
                        val year = Calendar.getInstance().get(Calendar.YEAR)
                        val birth = year - 2003
                        if (age == birth){
                            println("That's Correct Thank U $name")
                        }
                        if (age > birth) {
                            println("Nah Bro That's False I give u chance to try Again")
                            main()
                        }
                        if (age < birth){
                            println("Nah Bro That's False give u chance to try Again ")
                            main()
                        }
                    }
                    else
                    {
                        if (answer.isEmpty()){
                            println("Please Answer Yes Or No")
                            main()
                        }

                        if (answer == "No" || answer == "no"){
                            println("That's sad :( Thank U $name")
                        }

                    }
                }else {
                    if (reponse.isEmpty()){
                        println("Please Answer Yes Or No")
                        main()
                    }

                    if (reponse == "No" || reponse == "no") {
                        println("Ohh That's sad :( Ok Then Thank u $name")
                    }
                }
            }else{
                println(" Error !! Please Enter Your Name")
                main()
            }
        }
    }else{
        println("Please Answer ( Enter 1 Or 2) !! ")
        main()
    }


}