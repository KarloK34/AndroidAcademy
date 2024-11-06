package tasks

fun potentiate(base: Int, index: Int): Int {
    var result = 1

    for (i in (1..index)) {
        result *= base
    }

    return result
}

fun runTask7() {
    println(potentiate(-3, 3))
}