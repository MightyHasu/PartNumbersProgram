package factories;

import Anotation.PartAnotation;
import interfaces.Part;
import repositories.PartRepositoryImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/**
 * Created by PC2 on 9/12/2016.
 */
public class PartFactoryImpl {

    private PartRepositoryImpl partRepository;
    private String[] data;
    private static final String PARTS_PACKAGE_NAME = "models.";

    public PartFactoryImpl(PartRepositoryImpl partRepository, String[] data) {
        this.partRepository = partRepository;
        this.data = data;
    }

    public void generateParts() {
        Part part = null;

        Annotation[] annotations = Part.class.getAnnotations();

        for (Annotation annotation : annotations) {
            if (annotation instanceof PartAnotation) {
                PartAnotation myAnnotation = (PartAnotation) annotation;
            }
        }

        try {
            Class<Part> partClass = (Class<Part>) Class.forName(PARTS_PACKAGE_NAME);
            Constructor ctor = partClass.getDeclaredConstructor();
            ctor.setAccessible(true);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
