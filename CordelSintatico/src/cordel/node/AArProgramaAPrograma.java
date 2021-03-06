/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import java.util.*;
import cordel.analysis.*;

@SuppressWarnings("nls")
public final class AArProgramaAPrograma extends PAPrograma
{
    private final LinkedList<PADecVariavel> _declaraVar_ = new LinkedList<PADecVariavel>();
    private final LinkedList<PADecFuncao> _declaraFunc_ = new LinkedList<PADecFuncao>();

    public AArProgramaAPrograma()
    {
        // Constructor
    }

    public AArProgramaAPrograma(
        @SuppressWarnings("hiding") List<?> _declaraVar_,
        @SuppressWarnings("hiding") List<?> _declaraFunc_)
    {
        // Constructor
        setDeclaraVar(_declaraVar_);

        setDeclaraFunc(_declaraFunc_);

    }

    @Override
    public Object clone()
    {
        return new AArProgramaAPrograma(
            cloneList(this._declaraVar_),
            cloneList(this._declaraFunc_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArProgramaAPrograma(this);
    }

    public LinkedList<PADecVariavel> getDeclaraVar()
    {
        return this._declaraVar_;
    }

    public void setDeclaraVar(List<?> list)
    {
        for(PADecVariavel e : this._declaraVar_)
        {
            e.parent(null);
        }
        this._declaraVar_.clear();

        for(Object obj_e : list)
        {
            PADecVariavel e = (PADecVariavel) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._declaraVar_.add(e);
        }
    }

    public LinkedList<PADecFuncao> getDeclaraFunc()
    {
        return this._declaraFunc_;
    }

    public void setDeclaraFunc(List<?> list)
    {
        for(PADecFuncao e : this._declaraFunc_)
        {
            e.parent(null);
        }
        this._declaraFunc_.clear();

        for(Object obj_e : list)
        {
            PADecFuncao e = (PADecFuncao) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._declaraFunc_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._declaraVar_)
            + toString(this._declaraFunc_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._declaraVar_.remove(child))
        {
            return;
        }

        if(this._declaraFunc_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PADecVariavel> i = this._declaraVar_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PADecVariavel) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PADecFuncao> i = this._declaraFunc_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PADecFuncao) newChild);
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
