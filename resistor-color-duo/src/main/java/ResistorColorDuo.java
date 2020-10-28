class ResistorColorDuo {
    int value(String[] colors)
    {
        String set_colors[] = colors();
        int i = 0;
        String finalResult = "";

        while ((colors[i] != null) && (i < 2))
        {
            for (int j = 0; j < set_colors.length; j++)
            {
                if (colors[i] == set_colors[j]) {
                    finalResult += String.valueOf(j);
                }
            }
            i++;
        }
	System.out.println(finalResult);
        return Integer.parseInt(finalResult);
    }

    String[] colors()
    {
        String colors[] = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return colors;
    }
}
