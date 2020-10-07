class ResistorColor {
    int colorCode(String color) {
        String colors[] = colors();

        for (int i = 0; i < colors.length; i++ )
        {
            if (color == colors[i]) {
                return i;
            }
        }
        return 0;
    }

    String[] colors() {
        String colors[] = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return colors;
    }
}
