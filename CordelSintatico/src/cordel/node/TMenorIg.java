/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class TMenorIg extends Token
{
    public TMenorIg()
    {
        super.setText("<=");
    }

    public TMenorIg(int line, int pos)
    {
        super.setText("<=");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMenorIg(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMenorIg(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMenorIg text.");
    }
}
