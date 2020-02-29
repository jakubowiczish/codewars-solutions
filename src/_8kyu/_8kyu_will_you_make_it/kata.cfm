component {

    function zeroFuel( numeric distanceToPump, numeric mpg, numeric fuelLeft ){
        return mpg * fuelLeft >= distanceToPump;
    }

}