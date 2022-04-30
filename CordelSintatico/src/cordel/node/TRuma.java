/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class TRuma extends Token
{
    public TRuma()
    {
        super.setText("ruma");
    }

    public TRuma(int line, int pos)
    {
        super.setText("ruma");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRuma(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRuma(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRuma text.");
    }
}