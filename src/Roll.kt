class Roll(val pins: Int) {
    init {
        if (pins > 10) throw Error("Too many pins.")
    }
}