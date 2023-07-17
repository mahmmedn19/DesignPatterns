package designPatterns.factory

interface Pizza {
    fun prepare()
    fun bake()
    fun cut()
    fun box()
}