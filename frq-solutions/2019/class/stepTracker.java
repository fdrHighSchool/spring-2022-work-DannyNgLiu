public class stepTracker {
  private int steps;
  private int activeDays;
  private int totalDays;
  private int totalSteps;

public stepTracker(int steps) {
this.steps = steps;
this.activeDays = 0;
this.totalDays = 0;
this.totalSteps = 0;
}

public void addDailySteps(int steps) {
  if(steps >= this.steps) {
    this.activeDays++;
  }
  this.totalDays++;
  this.totalSteps = this.totalSteps + steps;
}

public int activeDays() {
  return this.activeDays;
}

public double averageSteps() {
  if(this.totalDays == 0) {
    return 0.0;
  }
  return (double)(this.totalSteps)/(totalDays);
}
}
