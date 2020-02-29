export const zeroFuel = (distance: number, mpg: number, fuelLeft: number): boolean => {
    return mpg * fuelLeft >= distance;
};