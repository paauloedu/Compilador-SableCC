/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class TFloat extends Token
{
    public TFloat()
    {
        super.setText("real");
    }

    public TFloat(int line, int pos)
    {
        super.setText("real");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFloat(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFloat(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFloat text.");
    }
}
