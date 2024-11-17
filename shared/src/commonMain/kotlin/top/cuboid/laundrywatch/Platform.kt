package top.cuboid.laundrywatch

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform