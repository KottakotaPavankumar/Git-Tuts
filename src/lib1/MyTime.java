package lib1;

public record MyTime (int hours, int mins, int secs){
	
	public int totaSeconds() {
return this.hours * 3600 + this.mins * 60 + this.secs;

	}
}
