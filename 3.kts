fun sheep()
{
    println("Вольер с овцами")
    println("Видим 4 ")
    println("Овцы издают звук: Меее ")
    println("Чтобы отойти от вольера: введите back")
    var n =  readLine()?.toString()
    if(n!! == "back") main()
}

fun monkey()
{
    println("Вольер с обезьянами")
    println("Видим 12 ")
    println("Обезьяны издают звук: Уа-а-а-а-а ")
    println("Чтобы отойти от вольера: введите back")
    var n =  readLine()?.toString()
    if(n!! == "back") main()
}

fun lion()
{
    println("Вольер со львами")
    println("Видим 2 ")
    println("Львы издают звук: Рррррр ")
    println("Чтобы отойти от вольера: введите back")
    var n =  readLine()?.toString()
    if(n!! == "back") main()
}

fun snake()
{
    println("Вольер со змеями")
    println("Видим 7 ")
    println("Змеи издают звук: Ссссссс ")
    println("Чтобы отойти от вольера: введите back")
    var n =  readLine()?.toString()
    if(n!! == "back") main()
}

fun main()
{
    println("Выберете к какому вольеру подойти")
    println("Вольер 1 : Введите 1")
    println("Вольер 2 : Введите 2")
    println("Вольер 3 : Введите 3")
    println("Вольер 4 : Введите 4")
    var n =  readLine()!!.toInt()
    if(n == 1)
    {
        sheep()
    }
    else if(n == 2)
    {
        monkey()
    }
    else if(n == 3)
    {
        lion()
    }
    else if(n == 4)
    {
        snake()
    }
    else
    {
        println("Такого вольера нет")
    }
}