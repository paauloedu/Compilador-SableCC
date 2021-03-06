/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class TInt extends Token
{
    public TInt()
    {
        super.setText("inteiro");
    }

    public TInt(int line, int pos)
    {
        super.setText("inteiro");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TInt(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInt(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TInt text.");
    }
}
