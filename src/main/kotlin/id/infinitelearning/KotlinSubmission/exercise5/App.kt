package id.infinitelearning.KotlinSubmission.exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */
    val hero = Hero()
    val anotherHero = Hero()


    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */
    hero.setProfile("Ferry", 20, 180)
    anotherHero.setProfile("Joko", 19, 170)


    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */
    hero.profile()
    println()

    /**
    Challenge:
    Group 1: jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
    Group 2: jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    Group 3: jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
    Group 4: jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Group 5: jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    Group 6: jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    Group 7: jalan 1x, lari 3x, makan 1x, minum 1x, lompat 2x, duduk 1x
    **/

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */

    fun doChallenge (jalan: Int, lari: Int, makan: Int, minum: Int, lompat: Int, duduk: Int) {
        for (i in 0 until jalan){
            if (hero.checkHealth()) break //looping stop jika player sudah mati
            else hero.jalan()
        }

        for (i in 0 until lari){
            if (hero.checkHealth()) break
            else hero.lari()
        }

        for (i in 0 until makan){
            if (hero.checkHealth()) break
            else hero.makan()
        }

        for (i in 0 until minum){
            if (hero.checkHealth()) break
            else hero.minum()
        }

        for (i in 0 until lompat){
            if (hero.checkHealth()) break
            else hero.lompat()
        }

        for (i in 0 until duduk){
            if (hero.checkHealth()) break
            else hero.duduk()
        }
    }

    //group 6 :
    doChallenge(2,4,2,2,7,4)

    if (!hero.checkHealth()) anotherHero.attack(hero) // call attack method if hero still alive

    if (hero.checkHealth()) {
        println("Anda telah mati ${hero.name}")
    }

    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */
    println()
    hero.profile()

}