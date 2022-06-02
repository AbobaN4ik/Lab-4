class tovars(var Name : String)
class inventory(var Name : String)

fun player()
{
    var pokupki = mutableListOf<inventory>()
    println("Ваши предметы :")
    for (i in pokupki) {
        println(i.Name)
    }
    println("Если хотите выйти в главное меню введите exit")
    var n = readLine()?.toString()
    if(n!! == "exit")
    {
        main()
    }
}

fun seller()
{
    var tovar1 = tovars("Кинжал Локи");
    var tovar2 = tovars("Мьёлнир");
    var tovar3 = tovars("Ваббаджек");
    var tovar4 = tovars("Зелье лечения");
    var tovar5 = tovars("Зелье выносливости");

    println("Введите название товара: ")
    var n = readLine()?.toString()
    if(n == tovar1.Name)
    {
        println("Вы приобрели : $n")
        inventory("Кинжал Локи")
        main()
    }
    else if(n == tovar2.Name)
    {
        println("Вы приобрели : $n")
        inventory("Мьёлнир")
        main()
    }
    else if(n == tovar3.Name)
    {
        println("Вы приобрели : $n")
        inventory("Ваббаджек")
        main()
    }
    else if(n == tovar4.Name)
    {
        println("Вы приобрели : $n")
        inventory("Зелье лечения")
        main()
    }
    else if(n == tovar5.Name)
    {
        println("Вы приобрели : $n")
        inventory("Зелье выносливости")
        main()
    }
    else
    {
        println("Такого товара нет в списке, откройте список товаров в главном меню")
        main()
    }
}

fun tovar()
{
    var tovar1 = tovars("Кинжал Локи");
    var tovar2 = tovars("Мьёлнир");
    var tovar3 = tovars("Ваббаджек");
    var tovar4 = tovars("Зелье лечения");
    var tovar5 = tovars("Зелье выносливости");

    println("Список товаров:")
    println(tovar1.Name)
    println(tovar2.Name)
    println(tovar3.Name)
    println(tovar4.Name)
    println(tovar5.Name)
    println("Если хотите вернутся в главное меню: введите exit")
    var n = readLine()?.toString()
    if(n!! == "exit")
    {
        main()
    }
}

fun main()
{

    while(true)
    {
        println("Выберете что вы хотите сделать: ")
        println("Посмотреть товары: введите gettov")
        println("Купить товары: введите getbuy")
        println("Посмотреть инвентарь: введите getinf")
        println("Если хотите выйти: введите exit")
        var n = readLine()?.toString()
        if(n == "gettov")
        {
            tovar()
        }
        else if(n == "getbuy")
        {
            seller()
        }
        else if(n == "getinf")
        {
            player()
        }
        else
        {
            println("Такой команды нет")
        }
    }
}