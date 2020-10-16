plugins{
	id("org.siouan.frontend-jdk8") version "4.0.0"
}

frontend {
    nodeDistributionProvided.set(true)
    nodeVersion.set("12.13.0")
    assembleScript.set("run build")
    cleanScript.set("run clean")
    checkScript.set("run check")
}