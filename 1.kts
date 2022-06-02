fun main(){
    val name = mutableSetOf<String>()
    val author = mutableSetOf<String>()
    val year = mutableSetOf<Int>()


    while (true) {
        println("Введите название книги: ")
        var n = readLine()?.toString()
        name.add(n!!)
        println("Введите автора книги: ")
        var c = readLine()?.toString()
        author.add(c!!)
        println("Введите год книги: ")
        var k = readLine()!!.toInt()
        year.add(k)
        println("Введите continue, если хотите продолжить или stop, если это все: ")
        var r = readLine()?.toString()
        if (r!! == "stop") break
    }

    print("Название книги | Автор | Год")
    println("\n $name")
    println("\n $author")
    println("\n $year")
}