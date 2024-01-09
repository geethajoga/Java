import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import Header from './components/Header';
import Navigation from './components/Navigation';
import Home from './components/Home';
import Doctors from './components/Doctors';
import Patients from './components/Patients';
import Appointments from './components/Appointments';
import Footer from './components/Footer';

const App = () => {
    return (
        <Router>
            <div>
                <Header />
                <Navigation />

                <Switch>
                    <Route path="/" exact component={Home} />
                    <Route path="/doctors" component={Doctors} />
                    <Route path="/patients" component={Patients} />
                    <Route path="/admin" component={admin} />
                    <Route path="/Receponsit" component={Receponsit} />
                    <Route path="/appointments" component={Appointments} />
                </Switch>

                <Footer />
            </div>
        </Router>
    );
}

export default App;
