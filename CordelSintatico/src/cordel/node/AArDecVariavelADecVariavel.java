/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import java.util.*;
import cordel.analysis.*;

@SuppressWarnings("nls")
public final class AArDecVariavelADecVariavel extends PADecVariavel
{
    private PATipo _aTipo_;
    private final LinkedList<PAExp> _identificadores_ = new LinkedList<PAExp>();

    public AArDecVariavelADecVariavel()
    {
        // Constructor
    }

    public AArDecVariavelADecVariavel(
        @SuppressWarnings("hiding") PATipo _aTipo_,
        @SuppressWarnings("hiding") List<?> _identificadores_)
    {
        // Constructor
        setATipo(_aTipo_);

        setIdentificadores(_identificadores_);

    }

    @Override
    public Object clone()
    {
        return new AArDecVariavelADecVariavel(
            cloneNode(this._aTipo_),
            cloneList(this._identificadores_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArDecVariavelADecVariavel(this);
    }

    public PATipo getATipo()
    {
        return this._aTipo_;
    }

    public void setATipo(PATipo node)
    {
        if(this._aTipo_ != null)
        {
            this._aTipo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aTipo_ = node;
    }

    public LinkedList<PAExp> getIdentificadores()
    {
        return this._identificadores_;
    }

    public void setIdentificadores(List<?> list)
    {
        for(PAExp e : this._identificadores_)
        {
            e.parent(null);
        }
        this._identificadores_.clear();

        for(Object obj_e : list)
        {
            PAExp e = (PAExp) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._identificadores_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aTipo_)
            + toString(this._identificadores_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aTipo_ == child)
        {
            this._aTipo_ = null;
            return;
        }

        if(this._identificadores_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aTipo_ == oldChild)
        {
            setATipo((PATipo) newChild);
            return;
        }

        for(ListIterator<PAExp> i = this._identificadores_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAExp) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
