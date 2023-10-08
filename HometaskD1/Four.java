public class Four {
        public static void main(String args[]) {
                String text = "To be or not to be, that is the question;"
                                + "Whether `tis nobler in the mind to suffer"
                                + " the slings and arrows of outrageous fortune,"
                                + " or to take arms against a sea of troubles,"
                                + " and by opposing end them?";

                String[] arr = text.split(" ");

                String temp = "";
                for (int i = 0; i < arr.length; i++) {
                        for (int j = i + 1; j < arr.length; j++) {
                                if (arr[i].compareTo(arr[j]) > 0) {
                                        temp = arr[i];
                                        arr[i] = arr[j];
                                        arr[j] = temp;
                                }
                        }
                }
        }
}
