/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import java.util.*;
import cordel.analysis.*;

@SuppressWarnings("nls")
public final class AArDecFuncaoADecFuncao extends PADecFuncao
{
    private PATipo _esq_;
    private PAExp _left_;
    private final LinkedList<PAParametros> _mid_ = new LinkedList<PAParametros>();
    private PABloco _dir_;

    public AArDecFuncaoADecFuncao()
    {
        // Constructor
    }

    public AArDecFuncaoADecFuncao(
        @SuppressWarnings("hiding") PATipo _esq_,
        @SuppressWarnings("hiding") PAExp _left_,
        @SuppressWarnings("hiding") List<?> _mid_,
        @SuppressWarnings("hiding") PABloco _dir_)
    {
        // Constructor
        setEsq(_esq_);

        setLeft(_left_);

        setMid(_mid_);

        setDir(_dir_);

    }

    @Override
    public Object clone()
    {
        return new AArDecFuncaoADecFuncao(
            cloneNode(this._esq_),
            cloneNode(this._left_),
            cloneList(this._mid_),
            cloneNode(this._dir_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArDecFuncaoADecFuncao(this);
    }

    public PATipo getEsq()
    {
        return this._esq_;
    }

    public void setEsq(PATipo node)
    {
        if(this._esq_ != null)
        {
            this._esq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._esq_ = node;
    }

    public PAExp getLeft()
    {
        return this._left_;
    }

    public void setLeft(PAExp node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public LinkedList<PAParametros> getMid()
    {
        return this._mid_;
    }

    public void setMid(List<?> list)
    {
        for(PAParametros e : this._mid_)
        {
            e.parent(null);
        }
        this._mid_.clear();

        for(Object obj_e : list)
        {
            PAParametros e = (PAParametros) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._mid_.add(e);
        }
    }

    public PABloco getDir()
    {
        return this._dir_;
    }

    public void setDir(PABloco node)
    {
        if(this._dir_ != null)
        {
            this._dir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dir_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._esq_)
            + toString(this._left_)
            + toString(this._mid_)
            + toString(this._dir_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._esq_ == child)
        {
            this._esq_ = null;
            return;
        }

        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._mid_.remove(child))
        {
            return;
        }

        if(this._dir_ == child)
        {
            this._dir_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._esq_ == oldChild)
        {
            setEsq((PATipo) newChild);
            return;
        }

        if(this._left_ == oldChild)
        {
            setLeft((PAExp) newChild);
            return;
        }

        for(ListIterator<PAParametros> i = this._mid_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAParametros) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._dir_ == oldChild)
        {
            setDir((PABloco) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
