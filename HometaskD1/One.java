public class One {
        public static void main(String[] args) {
                double radius = 0.0;
                double circleArea = 100.0;
                int feet = 0;
                int inches = 0;

                radius = Math.sqrt(circleArea / Math.PI);
                feet = (int) Math.floor(radius);
                inches = (int) Math.round(12.0 * (radius - feet));

                double earth_volume = (4.0 / 3.0) * Math.PI * Math.pow((7600.0 / 2.0), 3.0);
                double sun_volume = (4.0 / 3.0) * Math.PI * Math.pow((865000.0 / 2.0), 3.0);
                double sun_to_earth_ratio = sun_volume / earth_volume;

                System.out.println("The radius of a circle with area" + " square feet is\n " + feet + " feet " + inches
                                + " inches");

                System.out.println("The volume of the Earth is " + earth_volume + " cubic miles, "
                                + "the volume of the Sun is "
                                + sun_volume
                                + " cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is "
                                + sun_to_earth_ratio);

        }
}