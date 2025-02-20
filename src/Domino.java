public class Domino {
    private int top;
    private int bottom;

    public Domino()
    {
        top = 0;
        bottom = 0;
    }

    public Domino(int top, int bottom)
    {
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop()
    {
        return top;
    }

    public int getBottom()
    {
        return bottom;
    }

    public void setTop(int top)
    {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public String toString()
    {
        return top + "/" + bottom;
    }

    public void flip()
    {
        int temp1 = top;
        int temp2 = bottom;
        bottom = temp1;
        top = temp2;
    }

    public void settle()
    {
        if(top > bottom)
        {
            flip();
        }
    }

    public int compareTo(Domino other)
    {
        int smallest1;
        int biggest1;
        if(bottom > top)
        {
            smallest1 = top;
            biggest1 = bottom;
        }
        else
        {
            smallest1 = bottom;
            biggest1 = top;
        }
        int smallest2;
        int biggest2;
        if (other.bottom > other.top)
        {
            smallest2 = other.top;
            biggest2 = other.bottom;
        }
        else
        {
            smallest2 = other.bottom;
            biggest2 = other.top;
        }
        if(smallest1 < smallest2)
        {
            return -1;
        }
        else if (smallest1 > smallest2)
        {
            return 1;
        }
        else
        {
            if (biggest1 < biggest2)
            {
                return -1;
            }
            else if (biggest1 > biggest2)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }

    public int compareToWeight(Domino other)
    {
        int weight1 = top + bottom;
        int weight2 = other.top + other.bottom;
        if (weight1 < weight2)
        {
            return -1;
        }
        else if (weight1 > weight2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public boolean canConnect(Domino other)
    {
        if (other.top == top || top == other.bottom || bottom == other.top || bottom == other.bottom)
        {
            return true;
        }
        return false;
    }
}