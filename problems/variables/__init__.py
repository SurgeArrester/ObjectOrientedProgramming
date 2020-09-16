import check50
import check50_java

@check50.check()
def declarationsExists():
    """Declarations.java exists."""
    check50.exists("Declarations.java")

@check50.check(exists)
def declarationsCompiles():
    """Declarations.java compiles."""
    check50_java.compile("Declarations.java")

@check50.check(compiles)
def declarationsReturnsFloat():
    """Ensures declarations is returning the specified value"""
    check50_java.run("Declarations").stdout("-62.5").exit()

@check50.check()
def fpTestAppExists():
    """FPTestApp.java exists."""
    check50.exists("FPTestApp.java")

@check50.check(exists)
def fpTestAppCompiles():
    """FPTestApp.java compiles."""
    check50_java.compile("FPTestApp.java")

# TODO make sure return values match
@check50.check(compiles)
def fpTestAppReturnsFloat():
    """Ensures FPTestApp is printing the specified value"""
    check50_java.run("Declarations").stdout("1.0000000000000002").exit()