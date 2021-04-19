package com.tts;

public class Pet {

    public Pet(String name) {

    }

    public static void main(String[] args) {
        Pet pet = new Pet("chiba");

        System.out.println("whats your pets name");
        System.out.println(pet.name);
        System.out.println(pet.age);
        System.out.println(pet.type);

    }

        private String name;
        private String location;
        private int age;
        private String type;

    public Pet(String name, String animal, int age)
        {
            this.name = name;
            this.location = animal;
            this.age = age;
        }

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public String getLocation ()
        {
            return location;
        }

        public void setLocation (String location)
        {
            this.location = location;
        }

        public int getAge ()
        {
            return age;
        }

        public void setAge ( int age)
        {
            this.age = age;
        }

    }


