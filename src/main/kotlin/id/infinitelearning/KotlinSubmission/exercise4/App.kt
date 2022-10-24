package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    // Filter angka genap dengan try catch

    val evenNum = mutableListOf<Int>()

    println("Masukan jumlah angka :")
    var n = readln().toInt()
    println()

    for (i in 1..n) {
        try {
            println("Masukan angka ke-$i: ")
            val temp: Int = readln().toInt()

            if (temp % 2 == 0) {
                evenNum.add(temp)
            }
        } catch (e: NumberFormatException) {
            println("Not a valid number!")
            break // exit looping ketika ada invalid number
        } catch (e: Exception) {
            println(e)
            break // exit looping ketika ada exception lainnya
        }
        n--
    }

    println()
    println("Yang termasuk angka genap adalah $evenNum")

}