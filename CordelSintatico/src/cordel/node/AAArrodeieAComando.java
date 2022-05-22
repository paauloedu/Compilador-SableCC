/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class AAArrodeieAComando extends PAComando
{
    private PAAtrib _init_;
    private PAExp _mid_;
    private PAAtrib _incr_;
    private PAComando _dir_;

    public AAArrodeieAComando()
    {
        // Constructor
    }

    public AAArrodeieAComando(
        @SuppressWarnings("hiding") PAAtrib _init_,
        @SuppressWarnings("hiding") PAExp _mid_,
        @SuppressWarnings("hiding") PAAtrib _incr_,
        @SuppressWarnings("hiding") PAComando _dir_)
    {
        // Constructor
        setInit(_init_);

        setMid(_mid_);

        setIncr(_incr_);

        setDir(_dir_);

    }

    @Override
    public Object clone()
    {
        return new AAArrodeieAComando(
            cloneNode(this._init_),
            cloneNode(this._mid_),
            cloneNode(this._incr_),
            cloneNode(this._dir_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAArrodeieAComando(this);
    }

    public PAAtrib getInit()
    {
        return this._init_;
    }

    public void setInit(PAAtrib node)
    {
        if(this._init_ != null)
        {
            this._init_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._init_ = node;
    }

    public PAExp getMid()
    {
        return this._mid_;
    }

    public void setMid(PAExp node)
    {
        if(this._mid_ != null)
        {
            this._mid_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mid_ = node;
    }

    public PAAtrib getIncr()
    {
        return this._incr_;
    }

    public void setIncr(PAAtrib node)
    {
        if(this._incr_ != null)
        {
            this._incr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._incr_ = node;
    }

    public PAComando getDir()
    {
        return this._dir_;
    }

    public void setDir(PAComando node)
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
            + toString(this._init_)
            + toString(this._mid_)
            + toString(this._incr_)
            + toString(this._dir_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._init_ == child)
        {
            this._init_ = null;
            return;
        }

        if(this._mid_ == child)
        {
            this._mid_ = null;
            return;
        }

        if(this._incr_ == child)
        {
            this._incr_ = null;
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
        if(this._init_ == oldChild)
        {
            setInit((PAAtrib) newChild);
            return;
        }

        if(this._mid_ == oldChild)
        {
            setMid((PAExp) newChild);
            return;
        }

        if(this._incr_ == oldChild)
        {
            setIncr((PAAtrib) newChild);
            return;
        }

        if(this._dir_ == oldChild)
        {
            setDir((PAComando) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
