/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class TVolta extends Token
{
    public TVolta()
    {
        super.setText("volta");
    }

    public TVolta(int line, int pos)
    {
        super.setText("volta");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TVolta(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTVolta(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TVolta text.");
    }
}