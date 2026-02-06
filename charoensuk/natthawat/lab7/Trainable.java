package charoensuk.natthawat.lab7;

// Interface for employees who can attend training sessions.
public interface Trainable {
    void attendTraining(String courseName); // Records attendance in a training course.

    int getTrainingHours(); // Gets the total training hours completed.
}