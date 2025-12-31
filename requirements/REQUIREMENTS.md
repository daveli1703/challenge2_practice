# Requirements – Add Vehicle Feature

## User Story
As a user working with drink measurements, I want to convert between millilitres and cups, so that I can accurately measure ingredients.

## Acceptance Criteria

AC1: Given a non-negative millilitre value, when the millilitresToCups method is called, the system should calculate the result by dividing the input value by 250 and return the correct number of cups without performing any rounding or modification to the calculated value.

AC2: Given a negative input value provided to either the millilitresToCups or cupsToMillilitres method, when the method is invoked, the system should reject the input by throwing an IllegalArgumentException in order to prevent invalid or meaningless volume conversions.


con me may