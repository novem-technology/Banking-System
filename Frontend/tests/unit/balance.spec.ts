import { expect } from 'chai';
import { shallowMount } from '@vue/test-utils';
import Balance from '@/components/account/Balance.vue';
import Vue from 'vue';

describe('Balance.vue', () => {
  it('includes Username and Password fields', () => {
    const wrapper = shallowMount(Balance);
    expect(wrapper.text()).to.include('Account Balance');
  });
});
