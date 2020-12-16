package pro.devil.pr4

class Mushroom(val size: Int, val isMagic: Boolean) {
    constructor(isMagicParam: Boolean) : this(0, isMagicParam)
}