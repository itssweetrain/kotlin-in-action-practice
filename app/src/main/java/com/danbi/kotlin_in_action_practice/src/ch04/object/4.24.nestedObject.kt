package com.danbi.kotlin_in_action_practice.src.ch04.`object`

data class Person(val name: String) {
    object NameComparator: Comparator<Person> {
        override fun compare(p1: Person, p2: Person): Int = p1.name.compareTo(p2.name)
    }
}

fun main() {
    val people = listOf(Person("Bob"), Person("Alice"))
    println(people.sortedWith(Person.NameComparator))
}
