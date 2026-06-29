package classesandobjects;

/**
 * Pet Diary
 * 
 * <p>A pet owner keeps a diary of their animal companions. Each pet has a name, type (species), and age.
 * Different pet types make different sounds when they speak - this behavior varies by pet type.</p>
 * 
 * <p><b>Learning Focus:</b> Creating objects with different behaviors based on their attributes,
 * an introduction to polymorphic thinking.</p>
 */
public class Pet {
    private final String name, type;
    private final int age;

    /**
     * Creates a new pet record.
     * 
     * @param name the pet's name
     * @param type the pet's type/species (e.g., "dog", "cat")
     * @param age the pet's age in years
     */
    public Pet(String name, String type, int age) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Makes the pet speak by returning an appropriate sound.
     * 
     * @return the sound the pet makes: "Woof!" for dogs, "Meow!" for cats, "..." for unknown types
     */
    public String speak() {
        // type→sound mapping (dog→"Woof!", cat→"Meow!", default→"...").
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
} 