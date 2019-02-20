package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    String name;
    Pet[] pets;
    ArrayList<Pet> listOfPets = new ArrayList<>();

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        if(pets != null) { //added this because addPet test failed bc test passed pets = null
            for (Pet pet : pets) {
                listOfPets.add(pet);
                pet.setOwner(this);
            }
        }

    }


    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        Pet newPet = pet;
        listOfPets.add(newPet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        listOfPets.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return listOfPets.indexOf(pet) >= 0;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungestPetAge() {
        Integer currentAge = Integer.MAX_VALUE;

        for (Pet pet:listOfPets
             ) {
            if(pet.getAge() < currentAge) {
                currentAge = pet.getAge();
            }
        }
        return currentAge;
    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer currentAge = 0;

        for (Pet pet:listOfPets
        ) {
            if(pet.getAge() > currentAge) {
                currentAge = pet.getAge();
            }
        }
        return currentAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int numberOfPets = listOfPets.size();
        int sumOfAges = 0;
        for (Pet pet:listOfPets
             ) {
            sumOfAges = sumOfAges + pet.getAge();
        }

        return (float) sumOfAges / numberOfPets;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {

        return listOfPets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {

        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        Pet[] returnPets = new Pet[listOfPets.size()+1]; // added +1 so that test would run when listofpets has no elements
        for (int i = 0; i < listOfPets.size(); i++) {
            returnPets[i] = listOfPets.get(i);
        }

        return returnPets;
    }
}
