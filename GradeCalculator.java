public class GradeCalculator {
    public float getGrade(float math, float physics) {
        return math + physics;
    }
    
    public float getPercentage(float math, float physics) {
        return (math + physics/200)*100;
    }

}
