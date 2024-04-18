fun main() {
    /*
    TODO 1
        Buatlah variable dengan ketentuan berikut :
        - Variable dapat diubah sewaktu-waktu
        - Variable memiliki Identifier berupa myName
        - Variable memiliki tipe data berupa String
        - Variable memiliki Initialization berupa nama panggilan kamu
    */
    // Tulis Code dibawah ini
    var myName: String = "Hamdan"

    /*
    TODO 2
        Ubah Initialization pada varible myName diatas menjadi Nama Lengkap kamu
     */
    // Tulis Code dibawah ini

    myName = "Hamdan Syaputra"
    println(myName)

    /*
    TODO 4
        Buatlah Array dengan ketentuan berikut :
        - variabel Array bernama mobileMentors
        - Array berisi tipe data String
        - Index pada Array berisi ["Reza Kurniawan", "Raihan Zhaky", "Reynaldi", "Nabila Putri Syafarina Bukka", "Rahmad Noor Ikhsan"]
        - Ubah index yang berisi "Raihan Zhaky" pada Array menjadi "Raihan Zhaky Al-Hafizh"
        - Tampilkan index yang berisi "Raihan Zhaky Al-Hafizh"
    */
    // Tulis Code dibawah ini
    val mobileMentors  = arrayOf("Reza Kurniawan","Raihan Zhaky","Reynaldi", "Nabila Putri Syafarina Bukka","Rahmad Noor Ikhsan"
    )
    //--cara 1 primitive metod//
    mobileMentors[1] = "Raihan Zhaky Al-Hafizh"
    //--cara 2//
    mobileMentors.set(1,"Raihan Zhaky Al-Hafizh")

    //--silakan cari//
    println(mobileMentors[1])


    //-----------kalkulator----------------//
    println(calculator(5, 5))


    //-------pengukur--berat--benda--------///---limit---10kg//
    expedition(3)
}